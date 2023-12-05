def import import sys , traceback
import traceback
import time
import sys
import traceback
import traceback
import time
import sys
import traceback
try :
    sc = sys.stdin
except NameError :
    sc = sys.stdin
H , W = sc.shape [ 0 ] , sc.shape [ 1 ]
sy , sx , gy , gx = sys.exc_info ( ) [ : 2 ]
dx = [ - 1 , 0 , 1 , 0 ]
dy = [ 0 , 1 , 0 , - 1 ]
c = [ ]
step = [ ]
for s in sc.read ( ).split ( ) :
    for i in range ( W ) :
        c.append ( s [ i ] )
        step.append ( [ 100000 ] )
stack = deque ( )
step [ sx ] [ sy ] = 0
stack.append ( ( sx , sy ) )
while stack :
    p = stack.popleft ( )
    for i in range ( 4 ) :
        x = p [ 0 ] + dx [ i ]
        y = p [ 1 ] + dy [ i ]
        if 0 <= x < W and 0 <= y < H and c [ x ] [ y ] == '.' :
            if step [ x ] [ y ] > step [ p [ 0 ] ] [ p [ 1 ] ] + 1 :
                stack.append ( ( x , y ) )
                step [ x ] [ y ] = step [ p [ 0 ] ] [ p [ 1 ] ] + 1
    traceback.print_stack ( stack )
