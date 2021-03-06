const Person = function(name, favouriteColour){
  this.name = name;
  this.favouriteColour = favouriteColour;
};

Person.prototype.formatName = function(){
  const names = this.name.split(' ');
  const capitalisedNames = names.map((name) => {
    return TextFormat.capitalise(name);
  });
  this.name = capitalisedNames.join(' ')
}

Person.prototype.formatColour = function(){
  this.favouriteColour = TextFormat.capitalise(this.favouriteColour)
}
