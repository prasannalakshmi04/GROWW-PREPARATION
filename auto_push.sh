#!/bin/bash

REPO="$HOME/Desktop/PLACEMENTS/GROWW Preparation"

echo "🚀 Watching $REPO..."

fswatch -o "$REPO" | while read
do
    sleep 30

    cd "$REPO"

    git add .

    if git diff --cached --quiet; then
        continue
    fi

    git commit -m "Auto update: $(date '+%Y-%m-%d %H:%M:%S')"
    git push origin main
done

