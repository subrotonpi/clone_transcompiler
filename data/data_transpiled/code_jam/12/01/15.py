def qualification ( ) :
    import sys
    class A_SpeakingInTongues ( object ) :
        def __init__ ( self ) :
            self.in_file = 'data/A-small-attempt0.in'
            self.out_file = 'data/A-small-attempt0.out'
        def main ( self ) :
            if self.out_file :
                sys.stdout.write ( 'Case #%d: %s\n' % ( self.c + 1 , unicode ( self.line ) ) )
    example = [ [ 'ejp mysljylc kd kxveddknmc re jsicpdrysi' , 'our language is impossible to understand' ] , [ 'rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd' , 'there are twenty six factorial possibilities' ] , [ 'de kr kd eoya kw aej tysr re ujdr lkgc jv' , 'so it is okay if you want to just give up' ] ]
    mapping = [ 'y' , 'a' , 'e' , 'o' , 'q' , 'a' , 'z' ]
    for possibility in example :
        for a , b in zip ( possibility [ 0 ] , possibility [ 1 ] ) :
            if a != '' or b != '' :
                mapping [ a - 'a' ] = b
    reverse = [ ]
    for i in range ( 26 ) :
        if i in mapping :
            reverse.append ( 'a' + str ( i ) )
    missing1 = ''.join ( mapping ).index ( '\0' )
    missing2 = ''.join ( reverse ).index ( '\0' )
    mapping [ missing1 ] = chr ( missing2 + 'a' )
    reverse [ missing2 ] = chr ( missing1 + 'a' )
    f = open ( 'data/A-small-attempt0.in' , 'r' )
    f.write ( 'Case #%d: %s\n' % ( self.