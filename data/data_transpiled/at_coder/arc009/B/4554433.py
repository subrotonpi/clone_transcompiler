def _import ( ) : return sys.stdin.read ( )
import io
import readline
import readline
import readline
import readline.parse_string
import readline.parse_string
import readline.parse_string
import readline.parse_string
import readline.parse_string
import readline.parse_string
import readline.parse_string
import readline.parse_string
import readline.parse_string
import readline.parse_string
import readline.parse_string
import readline.parse_string
import readline.parse_string
import readline.parse_string
import readline.parse_string
import readline.parse_string
import readline.parse_string
import readline.parse_string
import readline.parse_string
import readline.parse_string
import readline.parse_string
import readline.parse_string
import readline.parse_string
import readline.parse_string
import readline.parse_string
import readline.parse_string
import readline.parse_string
import readline.parse_string
import readline.parse_string
import tokenize
class TaskB ( TaskB ) :
    def solve ( self , test_number , scanner , stdout ) :
        br = [ None for _ in range ( 10 ) ]
        n = scanner.next ( )
        a = [ scanner.next ( ) for scanner in scanner ]
        atc_numcmp = lambda a1 , a2 : cmp ( a1 , a2 )
        if len ( a1 ) != len ( a2 ) : return len ( a1 ) - len ( a2 )
        for c1 , c2 in zip ( a1 , a2 ) :
            if c1 != c2 : return br [ c1 - '0' ] - br [ c2 - '0' ]
        return 0
    a.sort ( key = atc_numcmp )
    for ca in a :
        stdout.write ( ca )
