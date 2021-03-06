package com.awssamples;

import com.awslabs.general.helpers.interfaces.ProcessHelper;
import com.awslabs.resultsiterator.v2.V2HelperModule;
import com.awssamples.amazon_ion_handler.AmazonIonHandlerStack;
import com.awssamples.cbor_handler.CborHandlerStack;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = {V2HelperModule.class})
public interface MasterInjector {
    void inject(AmazonIonHandlerStack amazonIonHandlerStack);

    void inject(CborHandlerStack cborHandlerStack);

    ProcessHelper processHelper();
}
