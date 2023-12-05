def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n , m = sc.count ( ) , sc.count ( )
        table = [ [ 0 ] * n ]
        for i in range ( 1 , m ) :
            for j in range ( 0 , n ) :
                dist = int ( math.fabs ( hand [ i ] - other [ i ] ) )
                if j >= dist :
                    if dp [ i - 1 ] [ j ] > 0 :
                        dp [ i ] [ j ] = 1
                if dp [ i - 1 ] [ j ] > 0 :
                    dp [ i ] [ j ] = 1
        sa = 0
        for i in range ( 0 , n ) :
            if dp [ i - 1 ] [ i ] > 0 :
                sa = i
                break
        taka , hasi = ( n + sa ) / 2 , ( n - sa ) / 2
        res = taka * ( taka - 1 ) / 2 + hasi * ( hasi - 1 ) / 2
        print ( res )
for i in range ( n ) :
    table [ i ] [ i ] += 1
cent = 0
ad = [ ]
for i in range ( n ) :
    count = 0
    for j in range ( n ) :
        if table [ i ] [ j ] == 0 :
            count += 1
    if count == 0 :
        cent += 1
    ad.append ( [ count ] )
    for j in range ( n ) :
        if table [ i ] [ j ] == 0 :
            ad [ i ].append ( j )
    hand , other = [ ] , [ ]
    con = 0
    prev = - 1
    stack = [ 0 ] * n + m
    color = [ - 1 ] * n
    while 1 :
        root = - 1
        label = 0
        for i in range ( prev + 1 , n ) :
            if color [ i ] != - 1 :
                continue
            root = i
        if root == - 1 :
            break
        size = 0
        stack.append ( root )
        color.append ( 0 )
    hand.append ( hand )
    other = [ ]
