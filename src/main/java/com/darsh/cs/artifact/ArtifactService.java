package com.darsh.cs.Hogwarts_artifacts_online.artifact;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ArtifactService {

    private final ArtifactRepository artifactRepository;


    public ArtifactService(ArtifactRepository artifactRepository) {
        this.artifactRepository = artifactRepository;
    }

    public Artifact findbyId(Integer id) {
        return null;
    }
}
