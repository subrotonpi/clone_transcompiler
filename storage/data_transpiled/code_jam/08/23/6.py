def _ ( ) : pass
import locale
import random
import time
import locale
import random
import locale
import locale
import random
import string
import string
import locale
import random
import time
two = 1048576
s = [ ]
def deck ( n ) :
    a = [ ]
    random.shuffle ( a )
    for i in range ( 1 , n + 1 ) :
        s.append ( random.choice ( string.ascii_lowercase + string.digits ) )
    for i in range ( two - 1 , 0 , - 1 ) :
        s.append ( s [ 2 * i ] + s [ 2 * i + 1 ] )
    p = 1
    fr = n
    for v in range ( 1 , n + 1 ) :
        u = ( v - 1 ) % fr
        q = find ( p , u )
        dec ( q )
        fr -= 1
        a.append ( v )
        p = q
        if fr % 100000 == 999 :
            print ( fr )
    return a
def find ( q , u ) :
    q += two
    big = sum ( q , 2 * two - 1 )
    if u >= big :
        return find ( 0 , u - big )
    low = q - 1
    high = 2 * two - 1
    while low + 1 < high :
        m = ( low + high ) // 2
        if sum ( q , m ) >= u + 1 :
            high = m
        else :
            low = m
    return high - two
def sum ( a , b ) :
    ans = 0
    while a <= b :
        if a % 2 == 1 :
            ans += s [ a ]
            a += 1
        if b % 2 == 0 :
            ans += s [ b ]
            b -= 1
        a //= 2
        b //= 2
    return ans
def dec ( q ) :
    q += two
    if s [ q ] == 0 :
        print ( "ERROR" )
    while q > 0 :
        s [ q ] -= 1
        q //= 2
def get ( self , index ) :
    low = self.index ( ) - 1
    high = self.index ( )
    return get ( self , index )
