def _import ( ) : return sys.stdout.write
import re
import time
import os
import os
import os
import time
import time
import re
class A :
    INPUT_PREFIX = "A"
    OUTPUT_SUFFIX = "-default"
    class TestCaseSolver :
        def __init__ ( self ) :
            self.n = randint ( 0 , len ( self.n ) )
            self.a = [ ]
            for i in range ( self.n ) :
                self.a.append ( self.__next__ ( ) )
            try :
                os.close ( self.stdin )
            except OSError :
                raise OSError ( )
    def run ( self ) :
        import fnmatch
        in_re = re.compile ( r'^' + re.escape ( INPUT_PREFIX ) + r'\-.*\.in$' , re.IGNORECASE )
        in_files = os.listdir ( '.' )
        for f in in_files :
            if fnmatch.fnmatch ( f , '*' + f ) :
                pass
            else :
                found = False
                for j in range ( self.n + 1 , self.n ) :
                    if can_put ( f , j ) :
                        for k in range ( j - 1 , self.n - 1 , - 1 ) :
                            self.swap ( k , k + 1 )
                        found = True
                        break
                    if not found :
                        raise OSError ( )
        sys.stdout.write ( ' ' * 8 + '\n' )
        sys.stdout.write ( answer )
    def swap ( self , row , sidx ) :
        for j in range ( self.n ) :
            if j > row and a [ sidx ] [ j ] == '1' :
                return False
        return True
    def solve ( self ) :
        time_start = time.time ( )
        try :
            self.stdin = open ( self.infile , "r" )
        except IOError :
            raise OSError ( )
        if not self.stdout :
            return False
        return True
    def solve ( self ) :
        return solve ( self )
    return solve
