def gcj2015.qualif ( ) :
    import os
    import sys
    import os
    import sys
    import os
    import sys
    import logging
    import logging
    import os
    import sys
    import os
    import sys
    import subprocess
    import subprocess
    class ExoD ( object ) :
        def __init__ ( self ) :
            self.base = '/home/jean/gcj2015/q/ExoD/'
            self.input = os.path.join ( base , 'b1.in' )
            self.output = os.path.join ( base , 'b1.out' )
            try :
                sc = subprocess.Popen ( [ self.input , '--output' ] , stdout = subprocess.PIPE )
            except Exception :
                logging.getLogger ( __name__ ).exception ( 'Failed to open %s' , self.output )
            else :
                n = len ( sc.stdout.readline ( ) )
                sc.stdout.readline ( )
                for c in range ( n ) :
                    print ( 'Test case %d...' % ( c + 1 ) , end = '' )
                    print ( 'Case #%d: ' % ( c + 1 ) , end = '' )
                    self.test ( sc , sys.stdout )
                    print ( )
                print ( )
                sys.stdout.flush ( )
                os.fsync ( sc.stdout.fileno ( ) )
        def test ( self , sc , file ) :
            X = sc.stdout.readline ( )
            R = sc.stdout.readline ( )
            C = sc.stdout.readline ( )
            if X >= 7 or ( R * C ) % X != 0 :
                print ( 'RICHARD' , end = '' )
            else :
                if X == 1 or X == 2 or ( X == 3 and ( R != 1 and C != 1 ) ) or ( X == 4 and ( R >= 4 and C > 2 or C >= 4 and R > 2 ) ) or ( X == 5 and ( ( R >= 4 and C >= 4 ) or ( R == 3 and C >= 10 ) or ( R >= 10 and C == 3 ) ) ) or ( X == 6 and ( R >= 4 and C >= 4 ) ) :
                    print ( ' GABRI@@