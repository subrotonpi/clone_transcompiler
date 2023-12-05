def _import ( ) : return float ( next ( ) )
def _import ( ) : return float ( next ( ) )
def _import ( ) : return float ( next ( ) )
def _exit ( ) : return sys.exit ( )
def _import ( ) :
    try :
        f = sys.stdin
    except AttributeError :
        sys.stdin = open ( '/dev/null' , 'w' )
        f.write ( '\n' )
        f.close ( )
    else :
        sys.stdin = sys.stdout
    tests = _import ( )
    for test in range ( 1 , tests + 1 ) :
        _import ( )
    stack = [ ]
    order = [ ]
    stack.append ( n - 1 )
    i :
    for i in range ( n - 2 , - 1 , - 1 ) :
        for j in range ( len ( stack ) - 1 , - 1 , - 1 ) :
            if stack [ j ] == best [ i ] :
                stack.append ( i )
                continue
            order.append ( stack [ j ] )
            stack.pop ( )
        _import ( )
        printcase ( )
        print ( 'Impossible' )
        return
    for i in reversed ( stack ) :
        order.append ( i )
    if len ( order ) != n - 1 :
        raise AssertionError
    ans = [ ]
    for i in range ( n - 2 , - 1 , - 1 ) :
        cur = order [ i ]
        angle = - i
        ans.append ( ans [ best [ cur ] ] - angle * ( best [ cur ] - cur ) )
    _import ( )
    for i in range ( n ) :
        if i > 0 :
            print ( '' , end = '' )
        print ( ans [ i ] , end = '' )
    print ( )
