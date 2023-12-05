def import import sys , string , traceback , StringIO , mp , ** kwargs ) :
    from itertools import izip , izip , izip
    from itertools import izip , izip , izip
    from itertools import izip , izip , izip
    sc = izip ( * [ '' ] * len ( string ) )
    n , q = map ( int , re.findall ( r'\d+' , sc ) )
    s = sc.next ( )
    AC = [ 1 for i in range ( n + 1 ) if s [ i - 1 ] == 'A' and s [ i ] == 'C' ]
    for i in range ( 1 , n + 1 ) :
        AC [ i ] += AC [ i - 1 ]
    for i in izip ( range ( q ) , izip ( range ( n ) , range ( n ) ) ) :
        l , r = map ( int , re.findall ( r'\d+' , sc ) )
        k = 0
        if r < n and s [ r - 1 ] == 'A' and s [ r ] == 'C' : k += 1
        yield max ( 0 , AC [ r ] - AC [ l - 1 ] - k )
    mp.close ( )
