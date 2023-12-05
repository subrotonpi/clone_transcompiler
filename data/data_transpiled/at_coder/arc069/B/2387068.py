def main ( ) :
    import sys
    def fill ( a , b , s ) :
        ans = [ ]
        for i in range ( 1 , len ( ans ) - 1 ) :
            if ans [ i - 1 ] == 'S' ^ s [ i ] == 'o' :
                ans.append ( 'S' )
            else :
                ans.append ( 'W' )
    fill ( 'S' , 'W' , s )
    if not ( ans [ - 2 ] == 'S'^s'^s[-1]=='o')andnot(ans[-1]=='S'^s' ^ s [ 0 ] == 'o' ) :
        print ( ''.join ( ans ) )
        return
    fill ( 'W' , 'S' , s )
    if not ( ans [ - 2 ] == 'S'^s'^s[-1]=='o')andnot(ans[-1]=='S'^s' ^ s [ 0 ] == 'o' ) :
        print ( ''.join ( ans ) )
        return
    fill ( 'W' , 'W' , s )
    if not ( ans [ - 2 ] == 'S'^s'^s[-1]=='o')andnot(ans[-1]=='S'^s' ^ s [ 0 ] == 'o' ) :
        print ( ''.join ( ans ) )
        return
    fill ( 'W' , 'W' , s )
    if not ( ans [ - 2 ] == 'S'^s'^s[-1]=='o')andnot(ans[-1]=='S'^s' ^ s [ 0 ] == 'o' ) :
        print ( ''.join ( ans ) )
        return
    fill ( 'W' , 'W' , s )
    if not ans [ - 1 ] == 'W' :
        print ( ''.join ( ans ) )
        return
    fill ( 'W' , 'W' , s )
