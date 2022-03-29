import os

f = open("_data/navigation.yml", "w")
f.write("daftar-matkul:\n")

all_file = os.listdir()
for folder in all_file:
    if os.path.isdir(folder) and not (folder.startswith(".") or folder.startswith("_")):
        
        f.write(f"\n  - title: {folder}\n")
        f.write("    children:\n")
        for file in os.listdir(folder):
            if file.endswith(".md"):
                f.write(f"      - title: \"{file[:-3]}\"\n")
                f.write(f"        url: /{folder}/{file.lower().replace(' ', '-')[:-2] + 'html'}\n")