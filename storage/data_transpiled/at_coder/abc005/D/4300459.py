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
from itertools import chain , repeat
class TaskD ( ) :
    def solve ( self , test_number , stdin , stdout ) :
        n = len ( stdin )
        sum = [ [ ] for _ in range ( 1 , n + 1 ) ]
        for i in range ( 1 , n + 1 ) :
            for j in range ( 1 , n + 1 ) :
                sum [ i ] [ j ] = stdin.read ( n ) + sum [ i - 1 ] [ j ] + sum [ i ] [ j - 1 ] - sum [ i - 1 ] [ j - 1 ]
        q = readline.parse_number
        for i in range ( q ) :
            p = readline.parse_file ( i )
            max = 0
            for w in range ( 1 , p + 1 ) :
                h = min ( p // w , n )
                for x in range ( w , n + 1 ) :
                    for y in range ( h , n + 1 ) :
                        cs = sum [ x ] [ y ] - sum [ x - w ] [ y ] - sum [ x ] [ y - h ] + sum [ x - w ] [ y - h ]
                        max = max + cs
            stdout.write ( max )
        return sum
