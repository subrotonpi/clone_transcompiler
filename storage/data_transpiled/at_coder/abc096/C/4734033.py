def import sys , os , sys , stdin , stdout , stderr , line , parent_loop
h = w = 0
square = [ ]
tmp = stdin.readline ( ).split ( 's' )
h = int ( tmp [ 0 ] )
w = int ( tmp [ 1 ] )
square = [ [ line.rstrip ( ) for line in stdout.readline ( ).split ( '\n' ) ] for line in square ]
result = True
parent_loop :
for i , ( line , _ ) in enumerate ( square ) :
    for j , ( line , _ ) in enumerate ( square [ i ] ) :
        if line [ j ] == '#' :
            if 0 <= i - 1 and square [ i - 1 ] [ j ] != '#' :
                if i + 1 < h and square [ i + 1 ] [ j ] != '#' :
                    if 0 <= j - 1 and square [ i ] [ j - 1 ] != '#' :
                        if j + 1 < w and square [ i ] [ j + 1 ] != '#' :
                            result = False
                            break
    if result :
        sys.stdout.write ( 'Yes' )
    else :
        sys.stdout.write ( 'No' )
