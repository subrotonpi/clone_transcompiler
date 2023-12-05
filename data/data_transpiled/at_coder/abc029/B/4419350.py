def main ( ) :
    import sys
    from nltk.corpus import brown
    with open ( 'README.rst' ) as f :
        words = [ ]
        for word in f.readlines ( ) :
            words.append ( word )
        count = 0
        for word in words :
            if 'r' in word :
                count += 1
        print ( count )
