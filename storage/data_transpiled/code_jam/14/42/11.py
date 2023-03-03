def import Scanner , sc
import time
import sys
import random
import sys
import time
import random
class Solution ( Scanner ) :
    def solve ( self ) :
        T = sc.randint ( 1 , T )
        for Case in range ( 1 , T + 1 ) :
            n = sc.randint ( 1 , T )
            a = [ random.randint ( 1 , T ) for i in range ( n ) ]
            ans = 0
            for i in range ( n ) :
                left = 0
                for j in range ( i ) :
                    if a [ j ] > a [ i ] :
                        left += 1
                right = 0
                for j in range ( i + 1 , n ) :
                    if a [ j ] > a [ i ] :
                        right += 1
                ans += min ( left , right )
            self.out.write ( "Case #%d: %d\n" % ( Case , ans ) )
    class UncaughtException ( Exception ) :
        def __init__ ( self ) :
            try :
                self.stdin = open ( "B-large.in" , "r" )
                self.stdout = open ( "B-large.out" , "w" )
                self.stderr = open ( "B-large.out" , "w" )
                self.stdout.write ( "\n" )
            except ( KeyboardInterrupt , SystemExit ) as self.stderr :
                self.stderr.write ( "\n" )
        def run ( self ) :
            try :
                self.stdin.close ( )
                self.stdout.close ( )
            except :
                self.stdout.close ( )
class Scanner ( Scanner ) :
    def __init__ ( self , * args ) :
        Scanner ( self )
        self.stdin = open ( "B-large.in" , "r" )
        self.stdout = open ( "B-large.out" , "w" )
        self.stdout.close ( )
    def run ( self ) :
        try :
            self.stdin.close ( )
            self.stdout.close ( )
        except :
            self.stdout.close ( )
