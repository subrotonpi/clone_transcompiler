def _ ( ) : return int ( next ( ) )
def f ( c ) :
    if '0' <= c <= '9' : return c - '0'
    return c - 'A' + 10
def calc ( a , b ) :
    n = len ( a )
    uf = UnionFind ( 36 )
    nz = [ ]
    nzpos = [ ]
    used = [ False ] * 36
    for i in range ( n ) :
        x = f ( a [ i ] )
        y = f ( b [ i ] )
        uf.unify ( x , y )
        if i == 0 :
            if x >= 10 :
                nz [ nzpos ] = x
            if y >= 10 :
                nz [ nzpos ] = y
    for i in range ( 10 ) :
        for j in range ( i ) :
            if uf.root ( j ) == uf.root ( j ) :
                return 0
    ans = 1
    for i in range ( n ) :
        v = f ( a [ i ] )
        if v < 10 :
            continue
        r = uf.root ( v )
        if r in used :
            continue
        found = False
        for j in range ( 10 ) :
            if uf.root ( j ) == uf.root ( v ) :
                found = True
                break
        used [ r ] = True
        if not found :
            ans *= 9 if i == 0 else 10
    return ans
def myScanner ( ) :
    sc = MyScanner ( )
    out = open ( '/dev/tty.py' , 'w' )
    n = sc.__next__ ( )
    a = sc.__next__ ( )
    b = sc.__next__ ( )
    out.write ( calc ( a , b ) )
    out.close ( )
return myScanner ( )
