def SPACETOKEN codejam2010.qualification ;
import os
import os
import sys
import os
import sys
import os
import os
import subprocess
import subprocess
import tempfile
class ProblemA :
    def __init__ ( self ) :
        self.file_stream = open ( os.path.join ( os.path.dirname ( __file__ ) , "files" , "codejam2010" , "qualification" ) )
    def __init__ ( self ) :
        self.file_stream = open ( os.path.join ( os.path.dirname ( __file__ ) , "files" , "codejam2010" , "qualification" ) )
        self.input_file = os.path.join ( self.folder , self.file_name + ".in" )
        self.output_file = os.path.join ( self.folder , self.file_name + ".out" )
        self.file_stream = open ( self.input_file , "r" )
        self.output_file = open ( self.output_file , "w" )
        self.count = int ( self.file_stream.readline ( ) )
        for i in range ( self.count ) :
            parameters = self.file_stream.readline ( ).split ( "s" )
            self.output_file.write ( "Case #%d: %s\n" % ( i + 1 , self.solve_it ( int ( parameters [ 0 ] ) , int ( parameters [ 1 ] ) ) ) )
    def solve_it ( n , k ) :
        all_on = ( 1 << n ) - 1
        return ( ( all_on & k ) == all_on ) and "ON" or "OFF"
    def close ( self ) :
        if self.file_stream is not None :
            try :
                self.file_stream.close ( )
            except IOError :
                pass
