def main ( ) :
    import sys
    from nltk.corpus import brown
    sc = brown.corpus ( 's1' )
    if int ( sc.count ( ) ) == 25 :
        print ( 'Christmas' )
    elif int ( sc.count ( ) ) == 24 :
        print ( 'Christmas Eve' )
    elif int ( sc.count ( ) ) == 23 :
        print ( 'Christmas Eve Eve' )
    elif int ( sc.count ( ) ) == 22 :
        print ( 'Christmas Eve Eve' )
