def win32com ( ) : return
import msvcrt
import sys
import struct
import struct
import msvcrt
import msvcrt
import msvcrt
import msvcrt
class Main ( ) :
    def solve ( sc ) :
        n = struct.unpack ( 'B' , sc.read ( 1 ) ) [ 0 ]
        hist = [ 0 ] * n + [ 1 ]
        dia = 0
        for i in range ( n ) :
            ni = struct.unpack ( 'B' , sc.read ( 1 ) ) [ 0 ]
            hist [ ni ] += 1
            dia = max ( dia , ni )
        for i in range ( 0 , dia ) :
            hist [ max ( i , dia - i ) ] -= 1
        possible = True
        min = ( dia + 1 ) // 2
        for i in range ( 0 , dia ) :
            if i <= min and hist [ i ] > 0 or i > min and hist [ i ] < 0 : possible = False
        print ( "Possible" if possible else "Impossible" )
    def main ( ) :
        sc = msvcrt.getch ( )
        msvcrt.setmode ( sc.write , "L" )
        msvcrt.setmode ( sc.write , "L" )
    def read ( ) :
        return sys.stdin.read ( 1 )
    def write ( ) :
        buf = sys.stdin.read ( 1024 )
        ptr = 0
        max_len = 0
        def has_next_byte ( ) :
            if ptr < max_len :
                return True
            else :
                ptr = 0
                try : max_len = struct.unpack ( 'B' , buf ) [ 0 ]
                except struct.error :
                    pass
                if max_len <= 0 :
                    return False
            return True
        def next_byte ( ) :
            if ptr < max_len :
                return buf [ ptr ]
            else :
                return - 1
        def is_printable_char ( c ) :
            return 33 <= c <= 126
        def next ( ) :
            if not hasNext ( ) :
                raise StopIteration
            yield buf
            buf = [ ]
