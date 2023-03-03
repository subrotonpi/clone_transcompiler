def package ( ) :
    import os
    import sys
    import os
    import subprocess
    import subprocess
    import subprocess
    import json
    import json
    import json
    import json
    import json
    import json
    import json
    import json
    class codejam2015_1C_A :
        def __init__ ( self ) :
            self.out = None
            self.infile = None
        def read ( self ) :
            R , C , W = self.next ( )
            self.R , self.C , self.W = self.next ( )
        def solve ( self ) :
            solution = 0
            solution += ( R - 1 ) * ( C / self.W )
            solution += ( C - 1 ) / self.W
            solution += self.W
            self.out.write ( solution )
            print ( solution )
        def output ( self , a ) :
            self.out.write ( a )
            print ( a )
        def run ( self ) :
            with open ( 'src/pydata/small_input.txt' , 'r' ) as f :
                self.outfile = f
    def read ( self ) :
        self.N = len ( self.input )
        for caseid in range ( 1 , self.N + 1 ) :
            read ( self )
            self.out.write ( 'Case #%d: ' % caseid )
            print ( 'Case #%d: ' % caseid )
            solve ( self )
            sys.stdout.flush ( )
    def debug ( * args ) :
        sys.stderr.write ( json.dumps ( args ) )
    def main ( ) :
        try :
            sys.stdin = open ( sys.argv [ 1 ] if sys.argv [ 1 ] else ( codejam2015_1C_A.__file__ + '.in' ) , 'r' )
        except :
            pass
        return codejam2015_1C_A ( )
    return main
