def import import sys , StringIO , StringIO , ConfigParser
class Main ( object ) :
    def __init__ ( self , parser ) :
        self.parser = parser
        self.stream = StringIO ( )
        self.stream = StringIO ( )
        self.parser.add_argument ( '--input' , action = 'store' , dest = 'input' , help = 'Input file to write to' )
        self.stream.seek ( 0 )
        self.parser.add_argument ( '--output' , action = 'store' , dest = 'output' , help = 'Output file to write to' )
        self.parser.add_argument ( '--test-number' , action = 'store' , dest = 'test_number' , help = 'Output number of test cases' )
        self.parser.add_argument ( '--hour' , action = 'store' , dest = 'hour' , help = 'Minimum number of hour (default: %d)' % self.parser.add_argument.dest )
        self.parser.add_argument ( '--minute' , action = 'store' , dest = 'minute' , help = 'Minimum number of minute (default: %d)' % self.parser.add_argument.dest )
        self.parser.add_argument ( '--second' , action = 'store' , dest = 'second' , help = 'Maximum number of second (default: %d)' % self.parser.add_argument.dest )
