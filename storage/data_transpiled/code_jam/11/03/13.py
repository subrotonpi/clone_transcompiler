def import _solve
import os
import sys
import sys
import os
import sys
import sys
class C ( ) :
    def solve ( self , a ) :
        a = sorted ( a )
        n = len ( a )
        total = 0
        xor = 0
        for i in range ( n ) :
            xor ^= a [ i ]
            total += a [ i ]
        if xor != 0 :
            return 'NO\n'
        total -= a [ 0 ]
        return '%s\n' % total
    def run_input ( self ) :
        n = int ( self.input.strip ( ) )
        items = self.input.strip ( ).split ( 's+' )
        a = [ int ( i ) for i in items ]
        return _solve ( a )
    def main ( self ) :
        c = C ( )
        with open ( 'C-sample' ) as f :
            c.parse_file ( 'C-small-attempt0' )
        with open ( 'C-large' ) as f :
            c.parse_file ( 'C-sample' )
    def parse_file ( self , file_prefix ) :
        file_in = file_prefix + '.in'
        file_out = file_prefix + '.out'
        f = open ( file_in , 'r' )
        n = int ( self.input.strip ( ) )
        for i in range ( 1 , n + 1 ) :
            ret = 'Case #%d: ' % i
            ret += run_input ( f )
            sys.stdout.write ( ret )
            f.write ( ret )
