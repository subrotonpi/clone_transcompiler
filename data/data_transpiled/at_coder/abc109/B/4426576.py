def main ( ) :
    import sys
    from nltk.corpus import brown
    from nltk.corpus import brown
    reader = brown.reader ( )
    A = len ( reader )
    list = [ ]
    for i in range ( A ) :
        list.append ( reader.next ( ) )
        if i > 0 :
            if list [ i - 1 ] [ - 1 ] != list [ i ] [ 0 ] :
                print ( 'No' , end = ' ' )
                return
            for j in range ( i - 1 , - 1 , - 1 ) :
                if list [ j ] == list [ i ] :
                    print ( 'No' , end = ' ' )
                    return
    print ( 'Yes' , end = ' ' )
