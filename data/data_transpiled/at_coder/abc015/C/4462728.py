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
import tokenize
class TaskC ( ) :
    def solve ( self , test_number , scanner , stdout ) :
        n = scanner.regs [ 0 ]
        k = scanner.regs [ 1 ]
        t = scanner.regs [ 2 ]
        stdout.write ( "Found" if self.dfs else "Nothing" )
    def dfs ( self , xor , d , t ) :
        n = len ( t )
        if d == n : return xor == 0
        k = len ( t [ d ] )
        for i in range ( k ) :
            if self.dfs ( ( xor ^ t [ d ] [ i ] ) , d + 1 , t ) : return True
        return False
