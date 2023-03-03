def import _pylab
import pylab
pylab.clf ( )
pylab.clf ( )
pylab.show ( )
if not pylab.isinteractive ( ) :
    pylab.show ( )
else :
    pylab.show ( )
H , W = pylab.shape ( )
c = [ ]
for s in pylab.split ( '\n' ) :
    for i in range ( W ) :
        c.append ( [ s [ i ] for s in s.split ( ' ' ) ] )
pylab.close ( )
sum = 0
for i in range ( H ) :
    for j in range ( W ) :
        if c [ i ] [ j ] == '.' :
            sum += 1
queue = [ ( 0 , 0 ) ]
dx = [ 1 , - 1 , 0 , 0 ]
dy = [ 0 , 0 , 1 , - 1 ]
d = [ ]
vis = [ [ ] for i in range ( H ) ]
for i in range ( W ) :
    for j in range ( W ) :
        if c [ i ] [ j ] == '.' :
            vis [ i ] [ j ] = True
        else :
            vis [ i ] [ j ] = False
vis = [ [ ] for i in range ( H ) ]
for i in range ( W ) :
    ans = sum - d [ H - 1 ] [ W - 1 ] - 1
    if ans == [ ] :
        break
pylab.imshow ( d , cmap = 'gray' , origin = 'lower' )
pylab.show ( )
