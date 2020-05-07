/*
//Section 5
//Overall good style, just make sure that code in method bodies are indented!

//1a.
public Username (String firstName, String lastName) {
if (firstName.length() > 0 && lastName.length() > 0) {
  //this is not how to do a constructor, do not call a constructor in own constructor
  Username person = new Username(firstName, lastName);
}
}

//b.
public void setAvailableUserNames(String[] usedNames){
  //usedNames is not an int, so subtraction cannot be used.
  possibleNames = possiblesNames - usedNames;
}

//Correct code:
//1a. Assuming that first and last are private fields of type String in same class
public Username (String firstName, String lastName) {
  if (firstName.length() > 0 && lastName.length() > 0) {
    first = firstName;
    last = lastName;
  }
}
  
//b. Assuming that possibleNames is a private field of type ArrayList<String> in the same class.
public void setAvailableUserNames(String[] usedNames){
  for (int i = 0; i < possibleNames.size(); i++) {
    for (int j = 0; j < usedNames.length; j++) {
      if (possibleNames[i].equals(usedNames[j])) {
        possibleNames.remove(i);
        i--;
        break;
      }
    }
  }
}

//Section 15
//Overall style ok, missing indentations for code inside methods, loops, and if statements

public static String replaceAll(String text, String what, String sub){
savedText.add(text);
int i = 0;
int n = what.length();
int k = sub.length();
while(i < text.length()){
i = text.indexOf(what);
if (i >= 0) {
text = replaceOne(text, i, n, sub);
i = i+k;
}
else break;
}
return text;
}

public static String undoReplaceAll(){
int n = savedText.size();
if (n > 0) {
String text = savedText.get(n - 1);
savedText.remove(n - 1);
return text;
//Syntax error: else and return should be seperated by at least one space.
}elsereturn null;
}

//Correct code:
public static String replaceAll(String text, String what, String sub){
  savedText.add(text);
  int i = 0;
  int n = what.length();
  int k = sub.length();
  while(i < text.length()){
    i = text.indexOf(what);
    if (i >= 0) {
      text = replaceOne(text, i, n, sub);
      i = i + k;
    }
    else break;
  }
  return text;
}
  
public static String undoReplaceAll(){
  int n = savedText.size();
  if (n > 0) {
    String text = savedText.get(n - 1);
    savedText.remove(n - 1);
    return text;
  }
  else
    return null;
}
*/