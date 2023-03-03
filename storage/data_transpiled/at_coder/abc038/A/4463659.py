def main ( ) :
    import sys
    from nltk.corpus import brown
    sc = brown.corpus ( 'drink' )
    drink = sc.read ( )
    lst = drink [ - 1 ]
    if lst == 'T' :
        print ( 'YES' )
    else :
        print ( 'NO' )
