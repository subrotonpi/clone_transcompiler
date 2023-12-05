def main ( ) :
    import sys
    from nltk.corpus import brown
    sc = brown.corpus ( 'word' )
    word = [ ]
    n = sc.count ( ' ' )
    sc.next ( )
    word.append ( sc.word )
    for bef , now in zip ( word [ 1 : n ] , word [ 1 : n ] ) :
        if bef [ - 1 ] != now [ 0 ] or now in word :
            print ( 'No' )
            return
        word.append ( now )
    print ( 'Yes' )
