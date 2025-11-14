param(
  [string]\ = "main"  # 'main' or 'tmp' or fully-qualified class
)

# compile everything into .\out
if (-not (Test-Path .\out)) { New-Item -ItemType Directory -Path .\out | Out-Null }
\ = Get-ChildItem -Recurse -Filter *.java | Where-Object { \.FullName -notmatch '\\.git\\' }
javac -d .\out \.FullName

if (\ -ne 0) { exit \ }

switch (\.ToLower()) {
  "main" { java -cp .\out org.apcsa.Main; break }
  "tmp"  { java -cp .\out org.apcsa.tmp.Tmp; break }
  default { java -cp .\out \; break }
}
