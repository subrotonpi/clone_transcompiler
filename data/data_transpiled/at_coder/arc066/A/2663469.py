def import _readline
import readline
import readline
import sys
import readline
import readline
import sys
class Main ( readline ) :
    def run ( self ) :
        sc = readline.get_scanner ( )
        n = sc.next ( )
        odd = n % 2 == 1
        check = [ ]
        for i in range ( n ) :
            a = sc.next ( )
            if a % 2 == 1 == odd :
                print ( 0 )
                return
            check.append ( a )
            if check [ a ] > 2 :
                print ( 0 )
                return
        if odd and check [ 0 ] != 1 :
            print ( 0 )
            return
        ans = pow ( 2 , n // 2 , 1000000007 )
        print ( ans )
    def pow ( x , n , MOD ) :
        ans = 1
        while n > 0 :
            if n & 1 == 1 :
                ans = ans * x % MOD
            x = x * x % MOD
            n >>= 1
        return ans
    class Fastreadline ( ) :
        def readline ( self ) :
            while not n or not readline.eof :
                try :
                    readline.next ( )
                except StopIteration :
                    pass
            return readline ( self )
        def __next__ ( self ) :
            while True :
                try :
                    readline.next ( )
                except StopIteration :
                    pass
            return readline ( self )
        def __next__ ( self ) :
            while True :
                try :
                    readline.next ( )
                except StopIteration :
                    pass
            return readline ( self )
        def __next__ ( self ) :
            while True :
                try :
                    readline.next ( )
                except StopIteration :
                    pass
                return readline ( self )
            return __next__
return Main
