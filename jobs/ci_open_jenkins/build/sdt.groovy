package ci_open_jenkins.build

import javaposse.jobdsl.dsl.DslFactory
import uk.gov.hmrc.jenkinsjobs.domain.builder.SbtLibraryJobBuilder

new SbtLibraryJobBuilder('local-template-renderer').
        build(this as DslFactory)

new SbtMicroserviceJobBuilder('frontend-template-provider').
        build(this as DslFactory)

new BuildMonitorViewBuilder('TAAS-MONITOR')
        .withJobs('local-template-renderer',
                  'frontend-template-provider')
        .build(this)
