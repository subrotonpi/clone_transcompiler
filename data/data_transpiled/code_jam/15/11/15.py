def _import ( ) : return ''
import os.path
import os
class PA ( object ) :
    PROBLEM_NAME = os.path.splitext ( os.path.basename ( __file__ ) ) [ 0 ].lower ( )
    INPUT_FILE_NAME = '%s.in' % PROBLEM_NAME
    OUTPUT_FILE_NAME = '%s.out' % PROBLEM_NAME
    class InputReader ( object ) :
        def __init__ ( self , filename ) :
            self.filenames = filename
            self.filenames = [ ]
        def readline ( self ) :
            while self.filenames is None or not self.filenames.startswith ( '.' ) :
                self.filenames = self.filenames.split ( '.' )
            return self.filenames [ 0 ]
        def __next__ ( self ) :
            return int ( self.filenames.pop ( 0 ) )
        def __next__ ( self ) :
            self.filenames = None
            return self.filenames.pop ( 0 )
    def main ( self ) :
        try :
            os.chdir ( os.path.dirname ( __file__ ) )
        except :
            pass
    def solve ( self ) :
        rd = InputReader ( INPUT_FILE_NAME )
        wr = open ( OUTPUT_FILE_NAME , 'w' )
        t = rd.__next__ ( )
        for ti in range ( t ) :
            n = rd.__next__ ( )
            m = [ rd.get ( i ) for i in range ( n ) ]
            result = self.subsolve ( m )
            wr.write ( 'Case #%d: %s\n' % ( ti + 1 , result ) )
        rd.close ( )
        wr.close ( )
    def subsolve ( self ) :
        result1 = 0
        n = len ( self.filenames )
        for i in range ( 1 , n ) :
            if self.filenames [ i ] < self.filenames [ i - 1 ] :
                result1 += self.filenames [ i - 1 ] - self.filenames [ i ]
