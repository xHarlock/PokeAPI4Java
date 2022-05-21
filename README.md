# PokeAPI4Java

A simple and lightweight package for using the PokéAPI in Java

## Installation

Maven:

```xml
<dependency>
  <groupId>com.xharlock</groupId>
  <artifactId>pokeapi4java</artifactId>
  <version>0.0.4</version>
</dependency>
```

## Usage

To get an `Pokemon` object, simply do

```java
Pokemon pokemon = PokeAPI.getPokemon(pokedex_id);
```

Similarly, for a `PokemonSpecies` object

```java
PokemonSpecies species = PokeAPI.getPokemonSpecies(pokedex_id);
```
