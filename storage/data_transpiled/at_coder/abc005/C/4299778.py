def _import ( ) : return sys.stdin.read ( )
import io
import readline
import readline
import readline
import readline.parse_file
import readline.parse_file
import readline.parse_file
import readline.parse_file
import readline.parse_file
import readline.parse_file
import readline.parse_file
import readline.parse_file
import readline.parse_file
import readline.parse_file
import readline.parse_file
import readline.parse_file
import readline.parse_file
import readline.parse_file
import readline.parse_file
import readline.parse_file
import readline.parse_file
import readline.parse_file
import readline.parse_file
import readline.parse_file
import readline.parse_file
import readline.parse_file
import readline.parse_file
import readline.parse_file
import readline.parse_file
import readline.parse_file
import readline.parse_file
import readline.parse_file
import readline.parse_file
import readline.parse_file
import readline.parse_file
import readline.parse_file
import readline.parse_file
import readline.parse_file
import readline.parse_file
import tokenize
class TaskC ( TaskC ) :
    def solve ( self , test_number , scanner , readline , readline ) :
        t = read_number ( )
        tako = [ ]
        a = [ ]
        b = [ ]
        wasted = [ ]
        n = readline.parse_file ( )
        for i in range ( n ) :
            a.append ( readline.read ( ) )
        m = readline.parse_file ( )
        for i in range ( m ) :
            b.append ( readline.read ( ) )
        ct = 0
        for i in tako + b :
            while len ( a ) and a [ - 1 ] == i :
                ct += 1
                a.pop ( )
                wasted.append ( i + t )
            while len ( b ) and b [ - 1 ] == i :
                if ct <= 0 :
                    readline.write_file ( 'no' )
                    return
                ct -= 1
                b.pop ( )
                wasted.pop ( )
            while len ( wasted ) and wasted [ - 1 ] == i :
                ct -= 1
                wasted.pop ( )
        readline.write_file ( 'yes' )
    return
