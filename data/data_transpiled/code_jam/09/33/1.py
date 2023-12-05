def _ import _ , os , sys , stdin , stdout , stderr , line , c , t , line , filename = 'c' )
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import time
import random
import sys
class C ( readline ) :
    def __init__ ( self ) :
        readline.__init__ ( self )
        self.stdin = stdin
        self.stdout = stdout
        self.readline.return_value = None
    def readline ( self ) :
        return int ( readline.readline ( ) )
    def readline ( self ) :
        return float ( readline.return_value )
    def readline ( self ) :
        return readline.readline ( )
    def readline ( self ) :
        return readline.strip ( )
    def readline ( self ) :
        return readline.split ( ) [ 0 ]
    def readline ( self ) :
        return readline.split ( ) [ 1 ]
    def select ( self , s ) :
        temp = s
        return ( s , temp.st , temp.en )
    def update ( self ) :
        return { s : temp.st , s : temp.en }
    def select ( self , s ) :
        if s > self.st :
            return 0
        if s == self.en :
            return end - start
        state = ( s , s )
        if state in h :
            return h [ state ]
        min = 1000000000
        for i in range ( s , s + 1 ) :
            min = min ( min , search ( s , i - 1 , start , pos [ i ] - 1 ) + search ( s , i + 1 , en , pos [ i ] + 1 , end ) + ( end - start ) )
        h [ state ] = min
        return min
    def solve ( self , test_number ) :
        stdout.write ( 'Case #%d: ' % test_number )
        h = { }
        n = randint ( 1 , q )
        pos = [ randint ( 1 , n ) for i in range ( q ) ]
        print ( search ( 0 , len ( pos ) - 1 , 0 , n - 1 ) )
    def run ( self ) :
        try :
            locale.setlocale ( locale.LC_ALL )
        except