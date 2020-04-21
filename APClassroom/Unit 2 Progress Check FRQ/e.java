String str = oldSeq.insertSegment("", 0);
LightSequence newSeq;

for (int i = 0; i < str.length() - 1; i++) {
  if (str.substring(i, i + 2) == segment) {
    str = str.substring(0, i) + str.substring(i + 2, str.length());
    newSeq = new LightSequence(str);
    break;
  }
}