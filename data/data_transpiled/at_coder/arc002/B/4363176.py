def _import ( ) : return sys.stdout.write
import os
import os
import __builtin__
import __builtin__
import __builtin__
import __builtin__
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = os.environ.get ( 'NFC' , '' )
        self.s = self.sc.next ( )
        self.uru = [ 0 , 31 , 28 , 31 , 30 , 31 , 30 , 31 ]
        self.ymd = [ ]
        for i in range ( 3 ) :
            self.ymd.append ( int ( self.day ) )
        if self.month < 10 :
            self.pl ( '%d/0' % self.month )
            return
        else :
            self.pl ( '%d/%d' % self.month )
            return
    def pf ( self , year , day ) :
        if self.day < 10 :
            self.pl ( '%d/0' % self.day )
            return
        else :
            self.pl ( '%d/%d' % ( year , month ) )
            return
    def pl ( self , year , day ) :
        if self.day < 10 :
            self.pl ( '%d/0' % self.day )
            return
        else :
            self.pl ( '%d/%d' % ( year , month ) )
            return
    class SC ( object ) :
        def __init__ ( self , stream = None ) :
            self.stream = stream
            self.stream = stream
            self.next = None
        def pl ( self ) :
            self.stream = stream or ''
            self.next = None
        def next ( self ) :
            if self.stream is None or not self.stream.readline ( ) :
                try :
                    self.stream = stream.next ( )
                except StopIteration :
                    raise __builtin__.NoStringError ( )
            return self.stream.read ( )
