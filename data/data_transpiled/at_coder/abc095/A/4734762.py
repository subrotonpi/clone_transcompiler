def import import sys
import string
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = string.ascii_lowercase
        s = sc.decode ( )
        c = s.split ( )
        ans = 700
        for i in c :
            if i == 'o' :
                ans += 100
        print ( ans )
        sc.close ( )
