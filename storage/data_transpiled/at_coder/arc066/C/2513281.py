def _import ( ) : return _import ( )
import random
import sys
import sys
import stream
class Main ( object ) :
    INF = int ( sys.maxint / 10 )
    def submit ( ) :
        n = randint ( 0 , 10 )
        a = [ ]
        plus = [ ]
        for i in range ( n ) :
            a.append ( randint ( 0 , c ) )
            if i != n - 1 :
                plus.append ( b )
        return float ( next ( a ) )
    def next_char ( ) :
        ret = 0
        b = skip ( )
        if b != '-' and ( b < '9' ) :
            raise InputError ( )
        neg = False
        if b == '-' :
            neg = True
            b = read_byte ( )
        while True :
            if b >= '0' and b <= '9' :
                ret = ret * 10 + ( b - '0' )
            else :
                if b != ' ' and not is_trash ( b ) :
                    raise InputError ( )
                return - ret if neg else ret
            b = read_byte ( )
        return float ( next ( a ) )
    def test ( ) :
        pass
    def stress ( ) :
        for tst in stress ( ) :
            if tst == False :
                raise AssertionError ( )
            sys.stderr.write ( tst )
    def main ( ) :
        fp = sys.stdin
        out = open ( '/dev/tty' , 'w' )
        submit ( )
        out.close ( )
    def rng ( ) :
        C = 5
        def rand ( l , r ) :
            return l + rng ( r - l + 1 )
        def main ( ) :
            pass
    def read ( ) :
        return sys.stdin.read ( 1 << 14 )
    def main ( ) :
        return sys.stdout.read ( 1 << 14 )
    def main ( ) :
        return main ( )
