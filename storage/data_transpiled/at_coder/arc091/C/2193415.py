def import import sys
from os.path import getsize
from os import urandom
from os import urandom
from os import fdopen
class Main ( object ) :
    def __init__ ( self ) :
        self.stream = open ( urandom ( 256 ) )
    def read ( self ) :
        return self.stream.read ( )
N = int ( os.urandom ( 256 ) )
A = int ( os.urandom ( 8 ) )
B = int ( os.urandom ( 16 ) )
if A + B - 1 > N or A * B < N :
    print ( - 1 )
    return
anslist = [ ]
n , m , l = 0 , 0 , 0
for i in range ( 1 , N + 1 ) :
    if N - i * B <= ( A - i - 1 ) + B :
        n , m , l = i , A - i - 1 , N - n * B - m
        break
for i in range ( n ) :
    for j in range ( B , 0 , - 1 ) :
        anslist.append ( i * B + j )
for i in range ( n * B + l , n * B - 1 , - 1 ) :
    anslist.append ( i )
for i in range ( n * B + l + 1 , N + 1 ) :
    anslist.append ( i )
f = open ( "/dev/tty" , "w" )
for i in anslist :
    f.write ( "%s%s" % ( "\n" if i == N - 1 else " " ) )
f.flush ( )
f.close ( )
