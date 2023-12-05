def main ( ) :
    import sys
    from string import atoi
    from string import printable
    sc = Scanner ( )
    s = sc.next ( )
    L = len ( s )
    update = True
    words = [ 'dream' , 'dreamer' , 'erase' , 'eraser' ]
    while update :
        update = False
        for word in words :
            if L >= len ( word ) and s [ L - len ( word ) : L ] == word :
                L -= len ( word )
                update = True
    print ( L == 0 and 'YES' or 'NO' )
    sc.close ( )
