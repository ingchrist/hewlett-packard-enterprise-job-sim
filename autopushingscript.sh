#!/bin/bash

# Directory to watch (change if needed)
WATCH_DIR="."

cd "$WATCH_DIR" || exit 1

echo "Watching $WATCH_DIR for changes..."

while inotifywait -r -e modify,create,delete,move .; do
    git add .
    git commit -m "in the mist of doing hard things by ingchrist: file/folder change "
    git push
    echo "Changes pushed to GitHub."
    echo -n "Sleeping for 30 seconds..."
    for i in {30..1}; do
        echo -ne "\r$i seconds remaining..."
        sleep 1
    done
    echo -e "\rSlept for 30 seconds.            "
    echo "Watching for changes again..."
done
