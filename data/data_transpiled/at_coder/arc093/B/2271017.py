def import import struct , time , time , dt , pipes , pipes , pipes , pipes , pipes , quote , quote , quote , quote , quote , quote , , , ;
from pipes import quote
from pipes import quote
import quote , quote , quote , quote , quote , quote , quote , quote , quote , ;
from pipes import quote
from pipes import quote , quote , quote , quote , quote , quote , quote , ;
def main ( ) :
    sc = pipes.open ( quote , quote )
    out = quote.quote
    os.chdir ( quote )
    used_memory_before = os.path.getsize ( quote ) - os.path.getsize ( quote )
    TIME_START = time.time ( )
    t = Task ( )
    t.solve ( sc , out )
    TIME_END = time.time ( )
    used_memory_after = os.path.getsize ( quote ) - os.path.getsize ( quote )
    out.close ( )
def solve ( sc , out ) :
    A = sc.__next__ ( )
    B = sc.__next__ ( )
    A -= 1
    B -= 1
    grid = [ [ 1 for i in range ( 50 ) ] for i in range ( 50 , 100 ) ]
    for i in range ( 50 , 2 ) :
        for j in range ( ( i & 1 ) , 100 , 2 ) :
            if A > 0 :
                grid [ i ] [ j ] = 1
                A -= 1
    for i in range ( 99 , - 1 , - 2 ) :
        for j in range ( ( i & 1 ) , 100 , 2 ) :
            if B > 0 :
                grid [ i ] [ j ] = 0
                B -= 1
        out.write ( "100 100" )
        for i in range ( 100 ) :
            for j in range ( 100 ) :
                out.write ( '.' if len ( grid [ i ] [ j ] ) == 1 else '#' )
            out.write ( quote )
