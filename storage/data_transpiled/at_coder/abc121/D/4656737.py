def import stdin , stdout , sys
from os import urandom
from io import BytesIO
from random import randint
from itertools import chain , repeat
class Main ( object ) :
    def solve ( self ) :
        A , B = sys.stdin.read ( 1 ) , sys.stdin.read ( 1 )
        self.stdout.write ( f ( B ) ^ f ( A - 1 ) )
    def f ( self , n ) :
        if n <= 0 : return 0
        if n % 2 == 0 : return f ( n - 1 ) ^ n
        ones = ( n + 1 ) // 2
        if ones % 2 == 0 : return 0
        return 1
    def main ( self ) :
        self.stdin = stdin
        self.stdout = stdout
        yield sys.stdin.read ( 1 )
