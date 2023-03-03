def _ _ init _ _ ( a , b ) :
    while b :
        tmp = a % b
        b = tmp
    return a
class Edge ( object ) :
    x , y = i
nx = j
ny = j + 1
while maze [ x ] [ y ].c != '#' :
    x = nx
    ny = y
for m in range ( 1 , 4 ) :
    for n in range ( 1 , 4 ) :
        if maze [ x ] [ y ].c == 'X' :
            return maze [ x ] [ y ].w
for m in range ( 1 , 4 ) :
    cost = dist ( i , j , m )
for n in range ( 1 , 4 ) :
    if maze [ x ] [ y ].status == 1 :
        maze [ x ] [ y ].w = n
for m in range ( 1 , 4 ) :
    for n in range ( 1 , 4 ) :
        if maze [ x ] [ y ].status == 1 :
            maze [ x ] [ y ].status = 1
if maze [ x ] [ y ].status == 1 :
    terminate ( 'no start point' )
maze [ x ] [ y ].status = 1
while maze [ x ] [ y ].status == 1 :
    for n in range ( 1 , 4 ) :
        if maze [ x ] [ y ].status == 1 :
            maze [ x ] [ y ].status = 1
if maze [ x ] [ y ].status == 1 :
    return maze [ x ] [ y ].status
else :
    return maze [ x ] [ y ].status
