/*
//Section 5
//Overall good style

//a.
public static int numberOfLeapYears(int year1, int year2){
  int leapYrs = 0;
  for(int i = year1; i <= year2; i++){
    //Syntax error: i should be lowercase, capital I is not defined
    if(isLeapYear(I))
      leapYrs++;
    } //Syntax error: Parsing error, remove this bracket
  }
  return leapYrs; 
}

//b.
private static int dayOfWeek(int month, int day, int year){
  int firstDayOfYear = firstDayOfYear(year);
  int day = dayOfYear(month, day, year);
  int week = firstDayOfYear;
  for(int i = 0; i < dayNumber; i++){
    week++;
    if(week == 7){
      week = 0;
    }
  }
  return week; 
}

//Correct code:
//a.
public static int numberOfLeapYears(int year1, int year2) {
  int leapYrs = 0;
  for(int i = year1; i <= year2; i++){
    if(isLeapYear(i))
      leapYrs++;
  }
  return leapYrs; 
}

//b.
private static int dayOfWeek(int month, int day, int year){
  int firstDayOfYear = firstDayOfYear(year);
  int day = dayOfYear(month, day, year);
  int week = firstDayOfYear;
  for(int i = 0; i < dayNumber; i++){
    week++;
    if(week == 7){
      week = 0;
    }
  }
  return week; 
}


//Section 15
//Overall good style

//a.
public int limitAmplitude(int limit){
  int changes = 0;
  int length = samples.length //Syntax error, missing ;
  for (int i = 0; i < length; i++){
    if(samples < -limit && samples[i] < 0) { //Redundant code, assuming limit > 0 is precondition
      samples[i] = -limit;
      changes++;
    }
    if(samples[i] > limit){
      samples[i] = limit;
      changes++;
    }
  }
  return changes; 
}

//b.
public void trimSilenceFromBeginning(){
  int silences = 0;
  while(samples[silences] == 0){
    silences++;
  }
  //Runtime error: assuming that silences is > i initially, there will be an index out of bounds exception.
  //Also, did not resize the array
  for(int i = 0; i < samples.length; i++){
    samples[i] = samples[silences];
    silences++;
  }
}

//Correct code:
//a. Precondition: limit > 0
public int limitAmplitude(int limit){
  int changes = 0;
  int length = samples.length;
  for (int i = 0; i < length; i++){
    if(samples < -limit) {
      samples[i] = -limit;
      changes++;
    }
    if(samples[i] > limit){
      samples[i] = limit;
      changes++;
    }
  }
  return changes; 
}

//b.
public void trimSilenceFromBeginning(){
  int silences = 0;
  while(samples[silences] == 0){
    silences++;
  }
  int[] newSamples = new int[samples.length - silences];
  for(int i = 0; i < newSamples.length; i++) {
    newSamples[i] = samples[silences];
    silences++;
  }
  samples = newSamples;
}
*/