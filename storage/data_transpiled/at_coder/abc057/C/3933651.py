def _import ( ) : return _import ( )
from os import urandom
from os import fdopen
from os import fdopen
from os import urandom
from os import urandom
from os import urandom
from os import urandom
from os import urandom
from random import randint
from random import choice
from random import choice
class Main ( object ) :
    def __init__ ( self ) :
        self._input_file = sys.stdin
        self._output_file = sys.stdout
        self._input_file = open ( '/dev/null' , 'w' )
        self._output_file = sys.stdout
        self._input_file = sys.stdin
        self._output_file = open ( '/dev/null' , 'w' )
        self._output_file = open ( '/dev/null' , 'w' )
        self._solver = Task ( )
        self.solve ( 1 , self._input_file , self._output_file )
        self._solver.close ( )
    def solve ( self , test_number , f , self ) :
        n = f ( test_number )
        pn = self._numbers.generate_prime_numbers ( int ( random ( ).sqrt ( n ) ) )
        divisors = [ ]
        for cpn in pn :
            while n % cpn == 0 :
                n /= cpn
                divisors.append ( cpn )
        ans = int ( '' )
        for i in range ( ( 1 , len ( divisors ) ) ) :
            a = n
            b = 1
            for j in divisors :
                if ( ( i >> j ) & 1 ) == 1 :
                    a *= divisors [ j ]
                else :
                    b *= divisors [ j ]
            ans = min ( max ( len ( str ( a ) ) , len ( str ( b ) ) ) , ans )
        f.write ( ans )
