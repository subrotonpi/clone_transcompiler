def import _readline
import readline
import sys
import readline
import readline
import readline
import sys
class Main ( readline ) :
    def __init__ ( self ) :
        sc = readline.readline ( )
        n , a , b = sc.split ( )
        hs = [ ]
        for i in range ( n ) :
            hs.append ( sc.split ( ) )
        self.solve ( )
    def solve ( ) :
        low = 0
        high = 1000000001
        while low < high :
            mid = ( low + high ) >> 1
            count = mid
            flag = True
            for i in range ( n ) :
                temp = hs [ i ] - b * mid
                if temp > 0 :
                    count -= temp / ( a - b )
                    if temp % ( a - b ) > 0 :
                        count -= 1
                    if count < 0 :
                        flag = False
                        break
            if flag :
                high = mid
            else :
                low = mid + 1
        print ( low )
    class Fastreadline ( ) :
        def readline ( self ) :
            while not isinstance ( self , readline ) or not readline.strip ( ) :
                try :
                    readline.readline ( )
                except EOFError :
                    pass
            return readline
        def randint ( self ) :
            return int ( self.next ( ) )
        def long ( self ) :
            return long ( self.next ( ) )
        def uniform ( self ) :
            return float ( self.next ( ) )
        def readline ( self ) :
            data = ''
            try :
                data = readline ( self )
            except EOFError :
                pass
            return data
return Main
