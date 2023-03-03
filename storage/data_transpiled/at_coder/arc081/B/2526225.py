def import _readline
import readline
import sys
import readline
import readline
import readline
MOD = 1000000007
def main ( ) :
    sc = readline.Fastreadline ( )
    n = sc.__next__ ( )
    ss = [ sc.__next__ ( ).split ( ) for i in range ( 2 ) ]
    solve ( )
def solve ( ) :
    num = 1
    prev_block = 0
    for i in range ( n ) :
        if ss [ 0 ] [ i ] == ss [ 1 ] [ i ] :
            if prev_block == 0 :
                num *= 3
            elif prev_block == 1 :
                num *= 2
            num %= MOD
            prev_block = 1
        else :
            if prev_block == 0 :
                num *= 6
            elif prev_block == 1 :
                num *= 2
            elif prev_block == 2 :
                num *= 3
            num %= MOD
            prev_block = 2
            i += 1
    print ( num )
class Fastreadline :
    def readline ( ) :
        readline.next = None
        while not readline.next ( ) or not readline.next ( ) :
            try :
                readline.next = readline.__next__
            except StopIteration :
                pass
        return readline.next
    def randint ( ) :
        return int ( readline.next )
    def long ( ) :
        return long ( readline.next )
    def double ( ) :
        return double ( readline.next )
    def readline ( ) :
        data = ''
        try :
            data = readline.next ( )
        except StopIteration :
            pass
        return data
return Fastreadline
