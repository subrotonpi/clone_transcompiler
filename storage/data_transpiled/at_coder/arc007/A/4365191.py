def import import sys , string , * , stdin , stdout , stderr , line , flags = re.compile ( r'\s+' , sys.stdout ).match ) :
    import sys , string , re
    from io import StringIO , BytesIO
    from io import BytesIO
    import sys
    if sys.version_info >= ( 3 , ) :
        from io import StringIO
    else :
        from io import BytesIO
    sc = Scanner ( stdin , stdout , stderr )
    x = sc.next ( ) [ 0 ]
    s = sc.next ( )
    for i in s :
        if i != x :
            sys.stdout.write ( s [ i ] )
    sys.stdout.write ( "\n" )
