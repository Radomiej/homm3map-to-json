# homm3map-to-json

Usage via command line:

```bash

java -jar <input-absolute-path-to-folder-with-original-heroes3-maps> <output-absolute-path-to-store-json-maps>

```

example full command:

```bash

java -jar E:\HeroesWorkarea\h3m E:\HeroesWorkarea\h3m-json

```

example of generated json:

# judgement day.h3m
<details>
  <summary>Click to expand!</summary>
  
   ```json

   {
  "version": "ROE",
  "size": 36,
  "hasUnderground": false,
  "title": "S�dny dzie�",
  "description": "Legenda m�wi, �e gdzie� w tych jaskiniach spoczywa legendarny Miecz sprawiedliwo�ci. Trzej najpot�niejsi W�adcy Podziemi poprzysi�gli, �e go zdob�d�, bowiem ten, kto dzier�y Miecz, panuje nad reszt�.",
  "players": [
    {
      "playerColor": "Red",
      "allowedTowns": [
        "Dungeon"
      ],
      "isRandomTown": false,
      "hasMainTown": true,
      "isTownsSet": true,
      "generateHeroAtMainTown": true,
      "generateHero": false,
      "hasRandomHero": null,
      "mainCustomHeroId": null,
      "mainTownType": null,
      "mainTownX": 2,
      "mainTownY": 34,
      "mainTownZ": 0
    },
    {
      "playerColor": "Blue",
      "allowedTowns": [
        "Dungeon"
      ],
      "isRandomTown": false,
      "hasMainTown": true,
      "isTownsSet": true,
      "generateHeroAtMainTown": true,
      "generateHero": false,
      "hasRandomHero": null,
      "mainCustomHeroId": null,
      "mainTownType": null,
      "mainTownX": 32,
      "mainTownY": 33,
      "mainTownZ": 0
    },
    {
      "playerColor": "Tan",
      "allowedTowns": [
        "Dungeon"
      ],
      "isRandomTown": false,
      "hasMainTown": true,
      "isTownsSet": true,
      "generateHeroAtMainTown": true,
      "generateHero": false,
      "hasRandomHero": null,
      "mainCustomHeroId": null,
      "mainTownType": null,
      "mainTownX": 17,
      "mainTownY": 4,
      "mainTownZ": 0
    }
  ],
  "availableArtifacts": null,
  "tiles": [
    {
      "terrain": "Rock",
      "terrainImageIndex": 1,
      "river": "No",
      "riverImageIndex": 0,
      "road": "No",
      "roadImageIndex": 0,
	  "flipConf" : [ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 ]
    },
    {
      "terrain": "Rock",
      "terrainImageIndex": 4,
      "river": "No",
      "riverImageIndex": 0,
      "road": "No",
      "roadImageIndex": 0,
	  "flipConf" : [ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 ]
    }
  ],
  "objects": [
    {
      "x": 13,
      "y": 10,
      "z": 0,
      "def": {
        "spriteName": "AVLdead0.def",
		"passableCells" : [ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 ],
        "activeCells": [],
        "placementOrder": 0,
        "objectId": 119,
        "objectClassSubId": 0,
        "visitable": false
      },
      "obj": "NO_OBJ",
      "owner": null
    },
    {
      "x": 15,
      "y": 27,
      "z": 0,
      "def": {
        "spriteName": "AVLr15u0.def",
		"passableCells" : [ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 ],
        "activeCells": [],
        "placementOrder": 0,
        "objectId": 147,
        "objectClassSubId": 0,
        "visitable": false
      },
      "obj": "NO_OBJ",
      "owner": null
    }
  ],
  "towns": {
    "0": 5
  }
}

   ```
</details>
