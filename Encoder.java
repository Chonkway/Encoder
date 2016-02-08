//Construct Encoders         0 and 1 are port numbers, replace as needed
Encoder enc;
enc = new Encoder(0, 1, false, Encoder.EncodingType.k4X);
//Set Code Perameters
Encoder sampleEncoder = new Encoder(0, 1, false, Encoder.EncodingType.k4X);
sampleEncoder.setMaxPeriod(.1);
sampleEncoder.setMinRate(10);
sampleEncoder.setDistancePerPulse(5);
sampleEncoder.setReverseDirection(true);
sampleEncoder.setSamplesToAverage(7);
//Start,Stop and Resetting         Call reset to set back to 0
Encoder sampleEncoder = new Encoder(0, 1, false, Encoder.EncodingType.k4X);
sampleEncoder.reset();
//Getting Values
Encoder sampleEncoder = new Encoder(0, 1, false, Encoder.EncodingType.k4X);
int count = sampleEncoder.get();
double distance = sampleEncoder.getRaw();
double distance = sampleEncoder.getDistance();
double period = sampleEncoder.getPeriod();
double rate = sampleEncoder.getRate();
boolean direction = sampleEncoder.getDirection();
boolean stopped = sampleEncoder.getStopped();

// Read at https://wpilib.screenstepslive.com/s/4485/m/13809/l/241875-encoders-measuring-rotation-of-a-wheel-or-other-shaft for more info